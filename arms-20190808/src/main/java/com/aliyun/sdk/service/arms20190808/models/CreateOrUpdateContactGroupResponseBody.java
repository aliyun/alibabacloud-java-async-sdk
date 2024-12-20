// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link CreateOrUpdateContactGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateContactGroupResponseBody</p>
 */
public class CreateOrUpdateContactGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertContactGroup")
    private AlertContactGroup alertContactGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateOrUpdateContactGroupResponseBody(Builder builder) {
        this.alertContactGroup = builder.alertContactGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateContactGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertContactGroup
     */
    public AlertContactGroup getAlertContactGroup() {
        return this.alertContactGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AlertContactGroup alertContactGroup; 
        private String requestId; 

        /**
         * <p>The information about the alert contact group.</p>
         */
        public Builder alertContactGroup(AlertContactGroup alertContactGroup) {
            this.alertContactGroup = alertContactGroup;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9319A57D-2D9E-472A-B69B-CF3CD16D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrUpdateContactGroupResponseBody build() {
            return new CreateOrUpdateContactGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOrUpdateContactGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateContactGroupResponseBody</p>
     */
    public static class AlertContactGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroupId")
        private Float contactGroupId;

        @com.aliyun.core.annotation.NameInMap("ContactGroupName")
        private String contactGroupName;

        @com.aliyun.core.annotation.NameInMap("ContactIds")
        private String contactIds;

        private AlertContactGroup(Builder builder) {
            this.contactGroupId = builder.contactGroupId;
            this.contactGroupName = builder.contactGroupName;
            this.contactIds = builder.contactIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertContactGroup create() {
            return builder().build();
        }

        /**
         * @return contactGroupId
         */
        public Float getContactGroupId() {
            return this.contactGroupId;
        }

        /**
         * @return contactGroupName
         */
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        /**
         * @return contactIds
         */
        public String getContactIds() {
            return this.contactIds;
        }

        public static final class Builder {
            private Float contactGroupId; 
            private String contactGroupName; 
            private String contactIds; 

            /**
             * <p>The ID of the alert contact group.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder contactGroupId(Float contactGroupId) {
                this.contactGroupId = contactGroupId;
                return this;
            }

            /**
             * <p>The name of the alert contact group.</p>
             * 
             * <strong>example:</strong>
             * <p>TestGroup</p>
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * <p>The IDs of the contacts that are included in the alert contact group.</p>
             * 
             * <strong>example:</strong>
             * <p>[1,2,3]</p>
             */
            public Builder contactIds(String contactIds) {
                this.contactIds = contactIds;
                return this;
            }

            public AlertContactGroup build() {
                return new AlertContactGroup(this);
            } 

        } 

    }
}
