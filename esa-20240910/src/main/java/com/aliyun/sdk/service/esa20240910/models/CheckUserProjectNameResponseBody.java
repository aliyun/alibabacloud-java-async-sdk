// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckUserProjectNameResponseBody} extends {@link TeaModel}
 *
 * <p>CheckUserProjectNameResponseBody</p>
 */
public class CheckUserProjectNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Check")
    private Boolean check;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckUserProjectNameResponseBody(Builder builder) {
        this.check = builder.check;
        this.description = builder.description;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUserProjectNameResponseBody create() {
        return builder().build();
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

        /**
         * <p>Indicates whether the name is valid. Valid values:</p>
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
         * <p>The reason why the name passed or failed the check.</p>
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
         * <p>ali-dcdn-log-56</p>
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

        public CheckUserProjectNameResponseBody build() {
            return new CheckUserProjectNameResponseBody(this);
        } 

    } 

}
