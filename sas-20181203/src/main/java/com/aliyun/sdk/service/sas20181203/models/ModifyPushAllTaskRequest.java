// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The check items. Separate multiple check items with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>OVAL_ENTITY</strong>: Common Vulnerabilities and Exposures (CVE) vulnerabilities</li>
         * <li><strong>CMS</strong>: Web-CMS vulnerabilities</li>
         * <li><strong>SYSVUL</strong>: Windows system vulnerabilities</li>
         * <li><strong>SCA</strong>: application vulnerabilities</li>
         * <li><strong>HEALTH_CHECK</strong>: baselines</li>
         * <li><strong>WEBSHELL</strong>: webshells</li>
         * <li><strong>PROC_SNAPSHOT</strong>: processes</li>
         * <li><strong>PORT_SNAPSHOT</strong>: ports</li>
         * <li><strong>ACCOUNT_SNAPSHOT</strong>: accounts</li>
         * <li><strong>SOFTWARE_SNAPSHOT</strong>: software assets</li>
         * <li><strong>SCA_SNAPSHOT</strong>: middleware</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HEALTH_CHECK,OVAL_ENTITY</p>
         */
        public Builder tasks(String tasks) {
            this.putQueryParameter("Tasks", tasks);
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>The UUIDs of servers on which you want to perform security check tasks. Separate multiple UUIDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inet-923b4538-0e88-409d-80ba-cb2e7487****,dc1691eb-656f-472f-b2aa-04f621f4****,70452f92-9fc1-45c5-ab35-e7bf8552****</p>
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
