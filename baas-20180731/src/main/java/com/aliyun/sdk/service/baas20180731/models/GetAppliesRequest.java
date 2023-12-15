// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppliesRequest} extends {@link RequestModel}
 *
 * <p>GetAppliesRequest</p>
 */
public class GetAppliesRequest extends Request {
    @Body
    @NameInMap("Bizid")
    private String bizid;

    @Body
    @NameInMap("Current")
    private Integer current;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("Status")
    private String status;

    private GetAppliesRequest(Builder builder) {
        super(builder);
        this.bizid = builder.bizid;
        this.current = builder.current;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppliesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
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

    public static final class Builder extends Request.Builder<GetAppliesRequest, Builder> {
        private String bizid; 
        private Integer current; 
        private Integer pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(GetAppliesRequest request) {
            super(request);
            this.bizid = request.bizid;
            this.current = request.current;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetAppliesRequest build() {
            return new GetAppliesRequest(this);
        } 

    } 

}
