// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link QueryCallbackRequest} extends {@link RequestModel}
 *
 * <p>QueryCallbackRequest</p>
 */
public class QueryCallbackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckForOss")
    private Boolean checkForOss;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private QueryCallbackRequest(Builder builder) {
        super(builder);
        this.checkForOss = builder.checkForOss;
        this.id = builder.id;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkForOss
     */
    public Boolean getCheckForOss() {
        return this.checkForOss;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<QueryCallbackRequest, Builder> {
        private Boolean checkForOss; 
        private Long id; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCallbackRequest request) {
            super(request);
            this.checkForOss = request.checkForOss;
            this.id = request.id;
            this.regionId = request.regionId;
        } 

        /**
         * CheckForOss.
         */
        public Builder checkForOss(Boolean checkForOss) {
            this.putBodyParameter("CheckForOss", checkForOss);
            this.checkForOss = checkForOss;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11234</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public QueryCallbackRequest build() {
            return new QueryCallbackRequest(this);
        } 

    } 

}
