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
         * <p>The name of the Logstore in Simple Log Service (SLS).</p>
         * 
         * <strong>example:</strong>
         * <p>wafng-logstore</p>
         */
        public Builder logStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * <p>Indicates whether the Simple Log Service project is created.</p>
         * 
         * <strong>example:</strong>
         * <p>wafng-project-14316572********-cn-hangzhou</p>
         */
        public Builder projectName(Boolean projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-<strong><strong>-A47C-6B19160</strong></strong>*</p>
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
