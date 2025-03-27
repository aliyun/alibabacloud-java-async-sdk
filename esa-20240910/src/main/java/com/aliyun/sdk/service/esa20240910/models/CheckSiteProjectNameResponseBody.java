// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CheckSiteProjectNameResponseBody} extends {@link TeaModel}
 *
 * <p>CheckSiteProjectNameResponseBody</p>
 */
public class CheckSiteProjectNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Check")
    private Boolean check;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckSiteProjectNameResponseBody(Builder builder) {
        this.check = builder.check;
        this.description = builder.description;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSiteProjectNameResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return check
     */
    public Boolean getCheck() {
        return this.check;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean check; 
        private String description; 
        private String projectName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckSiteProjectNameResponseBody model) {
            this.check = model.check;
            this.description = model.description;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the task name is valid. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder check(Boolean check) {
            this.check = check;
            return this;
        }

        /**
         * <p>The result description.</p>
         * 
         * <strong>example:</strong>
         * <p>project name pass the check</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the real-time log delivery task.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdn_waf_userAccount_log</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckSiteProjectNameResponseBody build() {
            return new CheckSiteProjectNameResponseBody(this);
        } 

    } 

}
