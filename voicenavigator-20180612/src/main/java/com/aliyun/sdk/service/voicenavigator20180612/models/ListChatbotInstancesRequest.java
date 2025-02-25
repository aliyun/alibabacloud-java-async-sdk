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
 * {@link ListChatbotInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListChatbotInstancesRequest</p>
 */
public class ListChatbotInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NluServiceParamsJson")
    private String nluServiceParamsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NluServiceType")
    private String nluServiceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnionSource")
    private String unionSource;

    private ListChatbotInstancesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nluServiceParamsJson = builder.nluServiceParamsJson;
        this.nluServiceType = builder.nluServiceType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.unionSource = builder.unionSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatbotInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nluServiceParamsJson
     */
    public String getNluServiceParamsJson() {
        return this.nluServiceParamsJson;
    }

    /**
     * @return nluServiceType
     */
    public String getNluServiceType() {
        return this.nluServiceType;
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
     * @return unionSource
     */
    public String getUnionSource() {
        return this.unionSource;
    }

    public static final class Builder extends Request.Builder<ListChatbotInstancesRequest, Builder> {
        private String instanceId; 
        private String nluServiceParamsJson; 
        private String nluServiceType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String unionSource; 

        private Builder() {
            super();
        } 

        private Builder(ListChatbotInstancesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nluServiceParamsJson = request.nluServiceParamsJson;
            this.nluServiceType = request.nluServiceType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.unionSource = request.unionSource;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NluServiceParamsJson.
         */
        public Builder nluServiceParamsJson(String nluServiceParamsJson) {
            this.putQueryParameter("NluServiceParamsJson", nluServiceParamsJson);
            this.nluServiceParamsJson = nluServiceParamsJson;
            return this;
        }

        /**
         * NluServiceType.
         */
        public Builder nluServiceType(String nluServiceType) {
            this.putQueryParameter("NluServiceType", nluServiceType);
            this.nluServiceType = nluServiceType;
            return this;
        }

        /**
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * UnionSource.
         */
        public Builder unionSource(String unionSource) {
            this.putQueryParameter("UnionSource", unionSource);
            this.unionSource = unionSource;
            return this;
        }

        @Override
        public ListChatbotInstancesRequest build() {
            return new ListChatbotInstancesRequest(this);
        } 

    } 

}
