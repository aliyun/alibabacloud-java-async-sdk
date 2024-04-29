// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPushAllTaskRequest} extends {@link RequestModel}
 *
 * <p>ModifyPushAllTaskRequest</p>
 */
public class ModifyPushAllTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tasks")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tasks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuids;

    private ModifyPushAllTaskRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
        this.tasks = builder.tasks;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPushAllTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return tasks
     */
    public String getTasks() {
        return this.tasks;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ModifyPushAllTaskRequest, Builder> {
        private String sourceIp; 
        private String tasks; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPushAllTaskRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
            this.tasks = request.tasks;
            this.uuids = request.uuids;
        } 

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The check items. Separate multiple check items with commas (,). Valid values:
         * <p>
         * 
         * *   **OVAL_ENTITY**: Common Vulnerabilities and Exposures (CVE) vulnerabilities
         * *   **CMS**: Web-CMS vulnerabilities
         * *   **SYSVUL**: Windows system vulnerabilities
         * *   **SCA**: application vulnerabilities
         * *   **HEALTH_CHECK**: baselines
         * *   **WEBSHELL**: webshells
         * *   **PROC_SNAPSHOT**: processes
         * *   **PORT_SNAPSHOT**: ports
         * *   **ACCOUNT_SNAPSHOT**: accounts
         * *   **SOFTWARE_SNAPSHOT**: software assets
         * *   **SCA_SNAPSHOT**: middleware
         */
        public Builder tasks(String tasks) {
            this.putQueryParameter("Tasks", tasks);
            this.tasks = tasks;
            return this;
        }

        /**
         * The UUIDs of servers on which you want to perform security check tasks. Separate multiple UUIDs with commas (,).
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ModifyPushAllTaskRequest build() {
            return new ModifyPushAllTaskRequest(this);
        } 

    } 

}
