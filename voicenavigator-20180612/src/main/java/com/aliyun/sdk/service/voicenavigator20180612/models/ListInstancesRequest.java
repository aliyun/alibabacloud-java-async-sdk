// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdListJsonString")
    private String instanceIdListJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NluServiceTypeListJsonString")
    private String nluServiceTypeListJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
    private String number;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnionInstanceId")
    private String unionInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnionSource")
    private String unionSource;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.instanceIdListJsonString = builder.instanceIdListJsonString;
        this.name = builder.name;
        this.nluServiceTypeListJsonString = builder.nluServiceTypeListJsonString;
        this.number = builder.number;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.unionInstanceId = builder.unionInstanceId;
        this.unionSource = builder.unionSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIdListJsonString
     */
    public String getInstanceIdListJsonString() {
        return this.instanceIdListJsonString;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nluServiceTypeListJsonString
     */
    public String getNluServiceTypeListJsonString() {
        return this.nluServiceTypeListJsonString;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return unionInstanceId
     */
    public String getUnionInstanceId() {
        return this.unionInstanceId;
    }

    /**
     * @return unionSource
     */
    public String getUnionSource() {
        return this.unionSource;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private String instanceIdListJsonString; 
        private String name; 
        private String nluServiceTypeListJsonString; 
        private String number; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 
        private String unionInstanceId; 
        private String unionSource; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
            this.instanceIdListJsonString = request.instanceIdListJsonString;
            this.name = request.name;
            this.nluServiceTypeListJsonString = request.nluServiceTypeListJsonString;
            this.number = request.number;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.unionInstanceId = request.unionInstanceId;
            this.unionSource = request.unionSource;
        } 

        /**
         * <p>The list of digital employee scenario IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;e4bebxxxxxxxxxxx&quot;]</p>
         */
        public Builder instanceIdListJsonString(String instanceIdListJsonString) {
            this.putQueryParameter("InstanceIdListJsonString", instanceIdListJsonString);
            this.instanceIdListJsonString = instanceIdListJsonString;
            return this;
        }

        /**
         * <p>The scenario name used as a filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The NLU type used to filter by dialog capability source. If this parameter is not specified, all types are selected.</p>
         * <ul>
         * <li><p>MANAGED: managed (deprecated).</p>
         * </li>
         * <li><p>AUTHORIZED: authorized. In the public cloud, this refers to Chatbot service.</p>
         * </li>
         * <li><p>PROVIDED: private. Configured by specifying the AccessKey ID, AccessKey Secret, and chatEndpoint in the O&amp;M console.</p>
         * </li>
         * <li><p>CCC_AUTHORIZED: uses a Chatbot authorized by Cloud Call Center.</p>
         * </li>
         * <li><p>CCC_FUNCTION: uses Alibaba Cloud Function Compute.</p>
         * </li>
         * <li><p>SSE_FUNCTION: uses a streaming function service. Function Compute that supports SSE, used to connect to third-party large language model chatbots.</p>
         * </li>
         * <li><p>PROMPTS: connects to Qwen foundation models.</p>
         * </li>
         * <li><p>LOCAL: private cloud, local Chatbot.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;CCC_AUTHORIZED&quot;]</p>
         */
        public Builder nluServiceTypeListJsonString(String nluServiceTypeListJsonString) {
            this.putQueryParameter("NluServiceTypeListJsonString", nluServiceTypeListJsonString);
            this.nluServiceTypeListJsonString = nluServiceTypeListJsonString;
            return this;
        }

        /**
         * <p>The inbound number used as a filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>021xxxxxxx</p>
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The scenario status used as a filter condition. If this parameter is not specified, all statuses are selected.</p>
         * <ul>
         * <li>DISABLED: offline.</li>
         * <li>PUBLISHED: published.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>When UnionSource is set to CCC, set UnionInstanceId to the instance ID of Cloud Call Center.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zhyl</p>
         */
        public Builder unionInstanceId(String unionInstanceId) {
            this.putQueryParameter("UnionInstanceId", unionInstanceId);
            this.unionInstanceId = unionInstanceId;
            return this;
        }

        /**
         * <p>The source.</p>
         * <ul>
         * <li>CCC: Cloud Call Center.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CCC</p>
         */
        public Builder unionSource(String unionSource) {
            this.putQueryParameter("UnionSource", unionSource);
            this.unionSource = unionSource;
            return this;
        }

        @Override
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

}
