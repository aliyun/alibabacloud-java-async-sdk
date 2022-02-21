// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserDetailRequest} extends {@link RequestModel}
 *
 * <p>GetUserDetailRequest</p>
 */
public class GetUserDetailRequest extends Request {
    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("IsvSubId")
    @Validation(required = true)
    private String isvSubId;

    @Body
    @NameInMap("NeedFaceDetail")
    private Boolean needFaceDetail;

    @Body
    @NameInMap("UserId")
    @Validation(required = true, maximum = 9999999999999D, minimum = 1)
    private Long userId;

    private GetUserDetailRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.isvSubId = builder.isvSubId;
        this.needFaceDetail = builder.needFaceDetail;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return isvSubId
     */
    public String getIsvSubId() {
        return this.isvSubId;
    }

    /**
     * @return needFaceDetail
     */
    public Boolean getNeedFaceDetail() {
        return this.needFaceDetail;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetUserDetailRequest, Builder> {
        private String corpId; 
        private String isvSubId; 
        private Boolean needFaceDetail; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserDetailRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.isvSubId = response.isvSubId;
            this.needFaceDetail = response.needFaceDetail;
            this.userId = response.userId;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * IsvSubId.
         */
        public Builder isvSubId(String isvSubId) {
            this.putBodyParameter("IsvSubId", isvSubId);
            this.isvSubId = isvSubId;
            return this;
        }

        /**
         * NeedFaceDetail.
         */
        public Builder needFaceDetail(Boolean needFaceDetail) {
            this.putBodyParameter("NeedFaceDetail", needFaceDetail);
            this.needFaceDetail = needFaceDetail;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetUserDetailRequest build() {
            return new GetUserDetailRequest(this);
        } 

    } 

}
