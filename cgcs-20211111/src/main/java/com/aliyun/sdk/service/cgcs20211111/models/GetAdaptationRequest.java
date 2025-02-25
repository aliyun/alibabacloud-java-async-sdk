// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAdaptationRequest} extends {@link RequestModel}
 *
 * <p>GetAdaptationRequest</p>
 */
public class GetAdaptationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdaptApplyId")
    private Long adaptApplyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersionId")
    private String appVersionId;

    private GetAdaptationRequest(Builder builder) {
        super(builder);
        this.adaptApplyId = builder.adaptApplyId;
        this.appVersionId = builder.appVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdaptationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adaptApplyId
     */
    public Long getAdaptApplyId() {
        return this.adaptApplyId;
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public static final class Builder extends Request.Builder<GetAdaptationRequest, Builder> {
        private Long adaptApplyId; 
        private String appVersionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAdaptationRequest request) {
            super(request);
            this.adaptApplyId = request.adaptApplyId;
            this.appVersionId = request.appVersionId;
        } 

        /**
         * AdaptApplyId.
         */
        public Builder adaptApplyId(Long adaptApplyId) {
            this.putBodyParameter("AdaptApplyId", adaptApplyId);
            this.adaptApplyId = adaptApplyId;
            return this;
        }

        /**
         * AppVersionId.
         */
        public Builder appVersionId(String appVersionId) {
            this.putBodyParameter("AppVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        @Override
        public GetAdaptationRequest build() {
            return new GetAdaptationRequest(this);
        } 

    } 

}
