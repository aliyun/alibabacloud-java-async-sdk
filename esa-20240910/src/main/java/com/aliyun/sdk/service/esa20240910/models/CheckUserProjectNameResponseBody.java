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
         * Check.
         */
        public Builder check(Boolean check) {
            this.check = check;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * RequestId.
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
