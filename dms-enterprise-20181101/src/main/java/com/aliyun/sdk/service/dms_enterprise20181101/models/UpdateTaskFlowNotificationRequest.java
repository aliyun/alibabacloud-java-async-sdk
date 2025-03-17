// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTaskFlowNotificationRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskFlowNotificationRequest</p>
 */
public class UpdateTaskFlowNotificationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagNotificationFail")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean dagNotificationFail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagNotificationSla")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean dagNotificationSla;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagNotificationSuccess")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean dagNotificationSuccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
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
         * <p>The unique ID of the task flow. You can call the <a href="https://help.aliyun.com/document_detail/424565.html">ListTaskFlow</a> or <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to query the task flow ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15***</p>
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * <p>Specifies whether to enable notifications for failed task flows. Notifications are disabled by default. You can enable notifications based on your business requirements.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dagNotificationFail(Boolean dagNotificationFail) {
            this.putQueryParameter("DagNotificationFail", dagNotificationFail);
            this.dagNotificationFail = dagNotificationFail;
            return this;
        }

        /**
         * <p>Specifies whether to enable SLA global notifications for task flows. Notifications are disabled by default. You can enable notifications based on your business requirements.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dagNotificationSla(Boolean dagNotificationSla) {
            this.putQueryParameter("DagNotificationSla", dagNotificationSla);
            this.dagNotificationSla = dagNotificationSla;
            return this;
        }

        /**
         * <p>Specifies whether to enable notifications for successful task flows. Notifications are disabled by default. You can enable notifications based on your business requirements.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dagNotificationSuccess(Boolean dagNotificationSuccess) {
            this.putQueryParameter("DagNotificationSuccess", dagNotificationSuccess);
            this.dagNotificationSuccess = dagNotificationSuccess;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
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
