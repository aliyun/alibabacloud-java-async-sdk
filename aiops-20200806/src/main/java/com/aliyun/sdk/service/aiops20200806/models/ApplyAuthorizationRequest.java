// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>ApplyAuthorizationRequest</p>
 */
public class ApplyAuthorizationRequest extends Request {
    @Query
    @NameInMap("SwitchFrontOperaUid")
    private String switchFrontOperaUid;

    @Query
    @NameInMap("Uid")
    private Long uid;

    private ApplyAuthorizationRequest(Builder builder) {
        super(builder);
        this.switchFrontOperaUid = builder.switchFrontOperaUid;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyAuthorizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return switchFrontOperaUid
     */
    public String getSwitchFrontOperaUid() {
        return this.switchFrontOperaUid;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<ApplyAuthorizationRequest, Builder> {
        private String switchFrontOperaUid; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(ApplyAuthorizationRequest request) {
            super(request);
            this.switchFrontOperaUid = request.switchFrontOperaUid;
            this.uid = request.uid;
        } 

        /**
         * SwitchFrontOperaUid.
         */
        public Builder switchFrontOperaUid(String switchFrontOperaUid) {
            this.putQueryParameter("SwitchFrontOperaUid", switchFrontOperaUid);
            this.switchFrontOperaUid = switchFrontOperaUid;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public ApplyAuthorizationRequest build() {
            return new ApplyAuthorizationRequest(this);
        } 

    } 

}
