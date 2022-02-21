// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateContactGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateContactGroupResponseBody</p>
 */
public class CreateOrUpdateContactGroupResponseBody extends TeaModel {
    @NameInMap("AlertContactGroup")
    private AlertContactGroup alertContactGroup;

    @NameInMap("RequestId")
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
         * AlertContactGroup.
         */
        public Builder alertContactGroup(AlertContactGroup alertContactGroup) {
            this.alertContactGroup = alertContactGroup;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrUpdateContactGroupResponseBody build() {
            return new CreateOrUpdateContactGroupResponseBody(this);
        } 

    } 

    public static class AlertContactGroup extends TeaModel {
        @NameInMap("ContactGroupId")
        private Float contactGroupId;

        @NameInMap("ContactGroupName")
        private String contactGroupName;

        @NameInMap("ContactIds")
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
             * 告警联系人组ID
             */
            public Builder contactGroupId(Float contactGroupId) {
                this.contactGroupId = contactGroupId;
                return this;
            }

            /**
             * 告警联系人组名称
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * 告警联系人ids
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
