// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListAckClustersRequest} extends {@link RequestModel}
 *
 * <p>ListAckClustersRequest</p>
 */
public class ListAckClustersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    private ListAckClustersRequest(Builder builder) {
        super(builder);
        this.page = builder.page;
        this.size = builder.size;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAckClustersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListAckClustersRequest, Builder> {
        private Integer page; 
        private Integer size; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListAckClustersRequest request) {
            super(request);
            this.page = request.page;
            this.size = request.size;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the ACK clusters belong.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp12nu14urf0upaf4****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListAckClustersRequest build() {
            return new ListAckClustersRequest(this);
        } 

    } 

}
