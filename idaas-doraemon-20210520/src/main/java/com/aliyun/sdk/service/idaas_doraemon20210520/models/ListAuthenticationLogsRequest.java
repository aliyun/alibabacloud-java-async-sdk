// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthenticationLogsRequest} extends {@link RequestModel}
 *
 * <p>ListAuthenticationLogsRequest</p>
 */
public class ListAuthenticationLogsRequest extends Request {
    @Query
    @NameInMap("ApplicationExternalId")
    @Validation(required = true)
    private String applicationExternalId;

    @Query
    @NameInMap("AuthenticatorType")
    private String authenticatorType;

    @Query
    @NameInMap("AuthenticatorUuid")
    private String authenticatorUuid;

    @Query
    @NameInMap("CredentialId")
    private String credentialId;

    @Query
    @NameInMap("FromTime")
    private Long fromTime;

    @Query
    @NameInMap("LogTag")
    private String logTag;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("ToTime")
    private Long toTime;

    @Query
    @NameInMap("UserId")
    private String userId;

    private ListAuthenticationLogsRequest(Builder builder) {
        super(builder);
        this.applicationExternalId = builder.applicationExternalId;
        this.authenticatorType = builder.authenticatorType;
        this.authenticatorUuid = builder.authenticatorUuid;
        this.credentialId = builder.credentialId;
        this.fromTime = builder.fromTime;
        this.logTag = builder.logTag;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.toTime = builder.toTime;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthenticationLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationExternalId
     */
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    /**
     * @return authenticatorType
     */
    public String getAuthenticatorType() {
        return this.authenticatorType;
    }

    /**
     * @return authenticatorUuid
     */
    public String getAuthenticatorUuid() {
        return this.authenticatorUuid;
    }

    /**
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * @return fromTime
     */
    public Long getFromTime() {
        return this.fromTime;
    }

    /**
     * @return logTag
     */
    public String getLogTag() {
        return this.logTag;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return toTime
     */
    public Long getToTime() {
        return this.toTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListAuthenticationLogsRequest, Builder> {
        private String applicationExternalId; 
        private String authenticatorType; 
        private String authenticatorUuid; 
        private String credentialId; 
        private Long fromTime; 
        private String logTag; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long toTime; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListAuthenticationLogsRequest request) {
            super(request);
            this.applicationExternalId = request.applicationExternalId;
            this.authenticatorType = request.authenticatorType;
            this.authenticatorUuid = request.authenticatorUuid;
            this.credentialId = request.credentialId;
            this.fromTime = request.fromTime;
            this.logTag = request.logTag;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.toTime = request.toTime;
            this.userId = request.userId;
        } 

        /**
         * ApplicationExternalId.
         */
        public Builder applicationExternalId(String applicationExternalId) {
            this.putQueryParameter("ApplicationExternalId", applicationExternalId);
            this.applicationExternalId = applicationExternalId;
            return this;
        }

        /**
         * AuthenticatorType.
         */
        public Builder authenticatorType(String authenticatorType) {
            this.putQueryParameter("AuthenticatorType", authenticatorType);
            this.authenticatorType = authenticatorType;
            return this;
        }

        /**
         * AuthenticatorUuid.
         */
        public Builder authenticatorUuid(String authenticatorUuid) {
            this.putQueryParameter("AuthenticatorUuid", authenticatorUuid);
            this.authenticatorUuid = authenticatorUuid;
            return this;
        }

        /**
         * CredentialId.
         */
        public Builder credentialId(String credentialId) {
            this.putQueryParameter("CredentialId", credentialId);
            this.credentialId = credentialId;
            return this;
        }

        /**
         * FromTime.
         */
        public Builder fromTime(Long fromTime) {
            this.putQueryParameter("FromTime", fromTime);
            this.fromTime = fromTime;
            return this;
        }

        /**
         * LogTag.
         */
        public Builder logTag(String logTag) {
            this.putQueryParameter("LogTag", logTag);
            this.logTag = logTag;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ToTime.
         */
        public Builder toTime(Long toTime) {
            this.putQueryParameter("ToTime", toTime);
            this.toTime = toTime;
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
        public ListAuthenticationLogsRequest build() {
            return new ListAuthenticationLogsRequest(this);
        } 

    } 

}
