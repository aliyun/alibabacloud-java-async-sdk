// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobErrorCodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobErrorCodeRequest</p>
 */
public class DescribeJobErrorCodeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private DescribeJobErrorCodeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.language = builder.language;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobErrorCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeJobErrorCodeRequest, Builder> {
        private String clientToken; 
        private String language; 
        private String ownerId; 
        private String regionId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobErrorCodeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.language = request.language;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.taskId = request.taskId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeJobErrorCodeRequest build() {
            return new DescribeJobErrorCodeRequest(this);
        } 

    } 

}
