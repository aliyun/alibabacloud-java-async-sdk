// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSiteMonitorAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeSiteMonitorAttributeRequest</p>
 */
public class DescribeSiteMonitorAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeAlert")
    private Boolean includeAlert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private DescribeSiteMonitorAttributeRequest(Builder builder) {
        super(builder);
        this.includeAlert = builder.includeAlert;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteMonitorAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeAlert
     */
    public Boolean getIncludeAlert() {
        return this.includeAlert;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeSiteMonitorAttributeRequest, Builder> {
        private Boolean includeAlert; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSiteMonitorAttributeRequest request) {
            super(request);
            this.includeAlert = request.includeAlert;
            this.taskId = request.taskId;
        } 

        /**
         * <p>Specifies whether to return the information of the alert rules that are configured for the site monitoring task. Valid values:</p>
         * <ul>
         * <li>true: The system returns the information of the alert rules that are configured for the site monitoring task.</li>
         * <li>false (default): The system does not return the information of the alert rules that are configured for the site monitoring task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeAlert(Boolean includeAlert) {
            this.putQueryParameter("IncludeAlert", includeAlert);
            this.includeAlert = includeAlert;
            return this;
        }

        /**
         * <p>The ID of the site monitoring task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc641dff-c19d-45f3-ad0a-818a0c4f****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeSiteMonitorAttributeRequest build() {
            return new DescribeSiteMonitorAttributeRequest(this);
        } 

    } 

}
