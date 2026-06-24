// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link DescribeDiagnosisSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisSettingsResponseBody</p>
 */
public class DescribeDiagnosisSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribeDiagnosisSettingsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisSettingsResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(DescribeDiagnosisSettingsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5E82B8A8-EED7-4557-A6E9-D1AD3E58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The return results.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeDiagnosisSettingsResponseBody build() {
            return new DescribeDiagnosisSettingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiagnosisSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosisSettingsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorizationStatus")
        private Boolean authorizationStatus;

        @com.aliyun.core.annotation.NameInMap("dailyLimit")
        private Integer dailyLimit;

        @com.aliyun.core.annotation.NameInMap("dailyScheduleEnabled")
        private Boolean dailyScheduleEnabled;

        @com.aliyun.core.annotation.NameInMap("diagnosisMode")
        private String diagnosisMode;

        @com.aliyun.core.annotation.NameInMap("scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("selectedItems")
        private java.util.List<String> selectedItems;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        private Result(Builder builder) {
            this.authorizationStatus = builder.authorizationStatus;
            this.dailyLimit = builder.dailyLimit;
            this.dailyScheduleEnabled = builder.dailyScheduleEnabled;
            this.diagnosisMode = builder.diagnosisMode;
            this.scene = builder.scene;
            this.selectedItems = builder.selectedItems;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return authorizationStatus
         */
        public Boolean getAuthorizationStatus() {
            return this.authorizationStatus;
        }

        /**
         * @return dailyLimit
         */
        public Integer getDailyLimit() {
            return this.dailyLimit;
        }

        /**
         * @return dailyScheduleEnabled
         */
        public Boolean getDailyScheduleEnabled() {
            return this.dailyScheduleEnabled;
        }

        /**
         * @return diagnosisMode
         */
        public String getDiagnosisMode() {
            return this.diagnosisMode;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return selectedItems
         */
        public java.util.List<String> getSelectedItems() {
            return this.selectedItems;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Boolean authorizationStatus; 
            private Integer dailyLimit; 
            private Boolean dailyScheduleEnabled; 
            private String diagnosisMode; 
            private String scene; 
            private java.util.List<String> selectedItems; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.authorizationStatus = model.authorizationStatus;
                this.dailyLimit = model.dailyLimit;
                this.dailyScheduleEnabled = model.dailyScheduleEnabled;
                this.diagnosisMode = model.diagnosisMode;
                this.scene = model.scene;
                this.selectedItems = model.selectedItems;
                this.updateTime = model.updateTime;
            } 

            /**
             * authorizationStatus.
             */
            public Builder authorizationStatus(Boolean authorizationStatus) {
                this.authorizationStatus = authorizationStatus;
                return this;
            }

            /**
             * dailyLimit.
             */
            public Builder dailyLimit(Integer dailyLimit) {
                this.dailyLimit = dailyLimit;
                return this;
            }

            /**
             * dailyScheduleEnabled.
             */
            public Builder dailyScheduleEnabled(Boolean dailyScheduleEnabled) {
                this.dailyScheduleEnabled = dailyScheduleEnabled;
                return this;
            }

            /**
             * diagnosisMode.
             */
            public Builder diagnosisMode(String diagnosisMode) {
                this.diagnosisMode = diagnosisMode;
                return this;
            }

            /**
             * <p>Scenarios of intelligent maintenance.</p>
             * 
             * <strong>example:</strong>
             * <p>Business Search</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * selectedItems.
             */
            public Builder selectedItems(java.util.List<String> selectedItems) {
                this.selectedItems = selectedItems;
                return this;
            }

            /**
             * <p>The timestamp of the last update for Intelligent Maintenance scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>1588994035385</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
