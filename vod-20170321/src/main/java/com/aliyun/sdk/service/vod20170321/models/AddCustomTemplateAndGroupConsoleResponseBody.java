// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link AddCustomTemplateAndGroupConsoleResponseBody} extends {@link TeaModel}
 *
 * <p>AddCustomTemplateAndGroupConsoleResponseBody</p>
 */
public class AddCustomTemplateAndGroupConsoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    @com.aliyun.core.annotation.NameInMap("TemplateGroup")
    private TemplateGroup templateGroup;

    private AddCustomTemplateAndGroupConsoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.templateGroup = builder.templateGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCustomTemplateAndGroupConsoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    /**
     * @return templateGroup
     */
    public TemplateGroup getTemplateGroup() {
        return this.templateGroup;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 
        private TemplateGroup templateGroup; 

        private Builder() {
        } 

        private Builder(AddCustomTemplateAndGroupConsoleResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.templateGroup = model.templateGroup;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        /**
         * TemplateGroup.
         */
        public Builder templateGroup(TemplateGroup templateGroup) {
            this.templateGroup = templateGroup;
            return this;
        }

        public AddCustomTemplateAndGroupConsoleResponseBody build() {
            return new AddCustomTemplateAndGroupConsoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddCustomTemplateAndGroupConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>AddCustomTemplateAndGroupConsoleResponseBody</p>
     */
    public static class TemplateGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateGroupId")
        private String templateGroupId;

        private TemplateGroup(Builder builder) {
            this.templateGroupId = builder.templateGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateGroup create() {
            return builder().build();
        }

        /**
         * @return templateGroupId
         */
        public String getTemplateGroupId() {
            return this.templateGroupId;
        }

        public static final class Builder {
            private String templateGroupId; 

            private Builder() {
            } 

            private Builder(TemplateGroup model) {
                this.templateGroupId = model.templateGroupId;
            } 

            /**
             * TemplateGroupId.
             */
            public Builder templateGroupId(String templateGroupId) {
                this.templateGroupId = templateGroupId;
                return this;
            }

            public TemplateGroup build() {
                return new TemplateGroup(this);
            } 

        } 

    }
}
