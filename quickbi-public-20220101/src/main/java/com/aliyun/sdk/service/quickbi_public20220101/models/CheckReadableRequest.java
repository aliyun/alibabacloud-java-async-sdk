// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckReadableRequest} extends {@link RequestModel}
 *
 * <p>CheckReadableRequest</p>
 */
public class CheckReadableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorksId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String worksId;

    private CheckReadableRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
        this.worksId = builder.worksId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckReadableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return worksId
     */
    public String getWorksId() {
        return this.worksId;
    }

    public static final class Builder extends Request.Builder<CheckReadableRequest, Builder> {
        private String userId; 
        private String worksId; 

        private Builder() {
            super();
        } 

        private Builder(CheckReadableRequest request) {
            super(request);
            this.userId = request.userId;
            this.worksId = request.worksId;
        } 

        /**
         * The user ID of the Quick BI to be checked.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * The ID of the work. Resources here include BI portal, dashboards, spreadsheets, and self-service access.
         */
        public Builder worksId(String worksId) {
            this.putQueryParameter("WorksId", worksId);
            this.worksId = worksId;
            return this;
        }

        @Override
        public CheckReadableRequest build() {
            return new CheckReadableRequest(this);
        } 

    } 

}
