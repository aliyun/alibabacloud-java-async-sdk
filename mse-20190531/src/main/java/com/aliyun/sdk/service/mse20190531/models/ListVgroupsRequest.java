// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVgroupsRequest} extends {@link RequestModel}
 *
 * <p>ListVgroupsRequest</p>
 */
public class ListVgroupsRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private ListVgroupsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.region = builder.region;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVgroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListVgroupsRequest, Builder> {
        private String acceptLanguage; 
        private String region; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListVgroupsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.region = request.region;
            this.userId = request.userId;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListVgroupsRequest build() {
            return new ListVgroupsRequest(this);
        } 

    } 

}
