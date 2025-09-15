// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link ModifyUserWafLogStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyUserWafLogStatusResponseBody</p>
 */
public class ModifyUserWafLogStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    private String logStoreName;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private Boolean projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyUserWafLogStatusResponseBody(Builder builder) {
        this.logStoreName = builder.logStoreName;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserWafLogStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return projectName
     */
    public Boolean getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String logStoreName; 
        private Boolean projectName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyUserWafLogStatusResponseBody model) {
            this.logStoreName = model.logStoreName;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
        } 

        /**
         * LogStoreName.
         */
        public Builder logStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(Boolean projectName) {
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

        public ModifyUserWafLogStatusResponseBody build() {
            return new ModifyUserWafLogStatusResponseBody(this);
        } 

    } 

}
