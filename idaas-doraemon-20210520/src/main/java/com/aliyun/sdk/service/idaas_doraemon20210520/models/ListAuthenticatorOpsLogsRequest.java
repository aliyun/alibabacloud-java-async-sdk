// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthenticatorOpsLogsRequest} extends {@link RequestModel}
 *
 * <p>ListAuthenticatorOpsLogsRequest</p>
 */
public class ListAuthenticatorOpsLogsRequest extends Request {
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
    @NameInMap("FromTime")
    private Long fromTime;

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

    private ListAuthenticatorOpsLogsRequest(Builder builder) {
        super(builder);
        this.applicationExternalId = builder.applicationExternalId;
        this.authenticatorType = builder.authenticatorType;
        this.authenticatorUuid = builder.authenticatorUuid;
        this.fromTime = builder.fromTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.toTime = builder.toTime;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthenticatorOpsLogsRequest create() {
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
     * @return fromTime
     */
    public Long getFromTime() {
        return this.fromTime;
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

    public static final class Builder extends Request.Builder<ListAuthenticatorOpsLogsRequest, Builder> {
        private String applicationExternalId; 
        private String authenticatorType; 
        private String authenticatorUuid; 
        private Long fromTime; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long toTime; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListAuthenticatorOpsLogsRequest request) {
            super(request);
            this.applicationExternalId = request.applicationExternalId;
            this.authenticatorType = request.authenticatorType;
            this.authenticatorUuid = request.authenticatorUuid;
            this.fromTime = request.fromTime;
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
         * FromTime.
         */
        public Builder fromTime(Long fromTime) {
            this.putQueryParameter("FromTime", fromTime);
            this.fromTime = fromTime;
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
        public ListAuthenticatorOpsLogsRequest build() {
            return new ListAuthenticatorOpsLogsRequest(this);
        } 

    } 

}
