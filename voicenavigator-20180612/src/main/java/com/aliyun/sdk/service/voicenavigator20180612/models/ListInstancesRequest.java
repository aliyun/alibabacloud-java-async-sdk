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
         * InstanceIdListJsonString.
         */
        public Builder instanceIdListJsonString(String instanceIdListJsonString) {
            this.putQueryParameter("InstanceIdListJsonString", instanceIdListJsonString);
            this.instanceIdListJsonString = instanceIdListJsonString;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NluServiceTypeListJsonString.
         */
        public Builder nluServiceTypeListJsonString(String nluServiceTypeListJsonString) {
            this.putQueryParameter("NluServiceTypeListJsonString", nluServiceTypeListJsonString);
            this.nluServiceTypeListJsonString = nluServiceTypeListJsonString;
            return this;
        }

        /**
         * Number.
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * UnionInstanceId.
         */
        public Builder unionInstanceId(String unionInstanceId) {
            this.putQueryParameter("UnionInstanceId", unionInstanceId);
            this.unionInstanceId = unionInstanceId;
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
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

}
