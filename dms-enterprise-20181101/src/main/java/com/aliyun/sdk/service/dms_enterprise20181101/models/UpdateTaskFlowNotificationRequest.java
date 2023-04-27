// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskFlowNotificationRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskFlowNotificationRequest</p>
 */
public class UpdateTaskFlowNotificationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DagId")
    @Validation(required = true)
    private Long dagId;

    @Query
    @NameInMap("DagNotificationFail")
    @Validation(required = true)
    private Boolean dagNotificationFail;

    @Query
    @NameInMap("DagNotificationSla")
    @Validation(required = true)
    private Boolean dagNotificationSla;

    @Query
    @NameInMap("DagNotificationSuccess")
    @Validation(required = true)
    private Boolean dagNotificationSuccess;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private UpdateTaskFlowNotificationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.dagNotificationFail = builder.dagNotificationFail;
        this.dagNotificationSla = builder.dagNotificationSla;
        this.dagNotificationSuccess = builder.dagNotificationSuccess;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskFlowNotificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return dagNotificationFail
     */
    public Boolean getDagNotificationFail() {
        return this.dagNotificationFail;
    }

    /**
     * @return dagNotificationSla
     */
    public Boolean getDagNotificationSla() {
        return this.dagNotificationSla;
    }

    /**
     * @return dagNotificationSuccess
     */
    public Boolean getDagNotificationSuccess() {
        return this.dagNotificationSuccess;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<UpdateTaskFlowNotificationRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private Boolean dagNotificationFail; 
        private Boolean dagNotificationSla; 
        private Boolean dagNotificationSuccess; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskFlowNotificationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.dagNotificationFail = request.dagNotificationFail;
            this.dagNotificationSla = request.dagNotificationSla;
            this.dagNotificationSuccess = request.dagNotificationSuccess;
            this.tid = request.tid;
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
         * Specifies whether to enable notifications for successful task flows. Notifications are disabled by default. You can enable notifications based on your business requirements.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder dagNotificationFail(Boolean dagNotificationFail) {
            this.putQueryParameter("DagNotificationFail", dagNotificationFail);
            this.dagNotificationFail = dagNotificationFail;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **UpdateTaskFlowNotification**.
         */
        public Builder dagNotificationSla(Boolean dagNotificationSla) {
            this.putQueryParameter("DagNotificationSla", dagNotificationSla);
            this.dagNotificationSla = dagNotificationSla;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to locate logs and troubleshoot issues.
         */
        public Builder dagNotificationSuccess(Boolean dagNotificationSuccess) {
            this.putQueryParameter("DagNotificationSuccess", dagNotificationSuccess);
            this.dagNotificationSuccess = dagNotificationSuccess;
            return this;
        }

        /**
         * Specifies whether to enable notifications for failed task flows. Notifications are disabled by default. You can enable notifications based on your business requirements.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public UpdateTaskFlowNotificationRequest build() {
            return new UpdateTaskFlowNotificationRequest(this);
        } 

    } 

}
