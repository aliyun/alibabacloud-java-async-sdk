// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMPCoSAuthorizedInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateMPCoSAuthorizedInfoRequest</p>
 */
public class UpdateMPCoSAuthorizedInfoRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("AuthorizedPhaseList")
    @Validation(required = true)
    private java.util.Map < String, ? > authorizedPhaseList;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    @Query
    @NameInMap("MemberId")
    @Validation(required = true)
    private String memberId;

    @Query
    @NameInMap("PhaseGroupId")
    @Validation(required = true)
    private String phaseGroupId;

    private UpdateMPCoSAuthorizedInfoRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.authorizedPhaseList = builder.authorizedPhaseList;
        this.bizChainId = builder.bizChainId;
        this.memberId = builder.memberId;
        this.phaseGroupId = builder.phaseGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMPCoSAuthorizedInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return authorizedPhaseList
     */
    public java.util.Map < String, ? > getAuthorizedPhaseList() {
        return this.authorizedPhaseList;
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return phaseGroupId
     */
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateMPCoSAuthorizedInfoRequest, Builder> {
        private String apiVersion; 
        private java.util.Map < String, ? > authorizedPhaseList; 
        private String bizChainId; 
        private String memberId; 
        private String phaseGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMPCoSAuthorizedInfoRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.authorizedPhaseList = request.authorizedPhaseList;
            this.bizChainId = request.bizChainId;
            this.memberId = request.memberId;
            this.phaseGroupId = request.phaseGroupId;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * AuthorizedPhaseList.
         */
        public Builder authorizedPhaseList(java.util.Map < String, ? > authorizedPhaseList) {
            String authorizedPhaseListShrink = shrink(authorizedPhaseList, "AuthorizedPhaseList", "json");
            this.putQueryParameter("AuthorizedPhaseList", authorizedPhaseListShrink);
            this.authorizedPhaseList = authorizedPhaseList;
            return this;
        }

        /**
         * BizChainId.
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * PhaseGroupId.
         */
        public Builder phaseGroupId(String phaseGroupId) {
            this.putQueryParameter("PhaseGroupId", phaseGroupId);
            this.phaseGroupId = phaseGroupId;
            return this;
        }

        @Override
        public UpdateMPCoSAuthorizedInfoRequest build() {
            return new UpdateMPCoSAuthorizedInfoRequest(this);
        } 

    } 

}
