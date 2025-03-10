// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteSiteMonitorsRequest} extends {@link RequestModel}
 *
 * <p>DeleteSiteMonitorsRequest</p>
 */
public class DeleteSiteMonitorsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDeleteAlarms")
    private Boolean isDeleteAlarms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskIds;

    private DeleteSiteMonitorsRequest(Builder builder) {
        super(builder);
        this.isDeleteAlarms = builder.isDeleteAlarms;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSiteMonitorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isDeleteAlarms
     */
    public Boolean getIsDeleteAlarms() {
        return this.isDeleteAlarms;
    }

    /**
     * @return taskIds
     */
    public String getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<DeleteSiteMonitorsRequest, Builder> {
        private Boolean isDeleteAlarms; 
        private String taskIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSiteMonitorsRequest request) {
            super(request);
            this.isDeleteAlarms = request.isDeleteAlarms;
            this.taskIds = request.taskIds;
        } 

        /**
         * <p>Specifies whether to delete the alert rules configured for the site monitoring tasks. Valid values:</p>
         * <ul>
         * <li>true (default value)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDeleteAlarms(Boolean isDeleteAlarms) {
            this.putQueryParameter("IsDeleteAlarms", isDeleteAlarms);
            this.isDeleteAlarms = isDeleteAlarms;
            return this;
        }

        /**
         * <p>The IDs of the site monitoring tasks that you want to delete. Separate multiple task IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01adacc2-ece5-41b6-afa2-3143ab5d****,43bd1ead-514f-4524-813e-228ce091****</p>
         */
        public Builder taskIds(String taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public DeleteSiteMonitorsRequest build() {
            return new DeleteSiteMonitorsRequest(this);
        } 

    } 

}
