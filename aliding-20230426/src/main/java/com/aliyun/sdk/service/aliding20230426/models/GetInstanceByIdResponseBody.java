// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetInstanceByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceByIdResponseBody</p>
 */
public class GetInstanceByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("actionExecutor")
    private java.util.List<ActionExecutor> actionExecutor;

    @com.aliyun.core.annotation.NameInMap("approvedResult")
    private String approvedResult;

    @com.aliyun.core.annotation.NameInMap("createTimeGMT")
    private String createTimeGMT;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.Map<String, ?> data;

    @com.aliyun.core.annotation.NameInMap("formUuid")
    private String formUuid;

    @com.aliyun.core.annotation.NameInMap("instanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("modifiedTimeGMT")
    private String modifiedTimeGMT;

    @com.aliyun.core.annotation.NameInMap("originator")
    private Originator originator;

    @com.aliyun.core.annotation.NameInMap("processCode")
    private String processCode;

    @com.aliyun.core.annotation.NameInMap("processInstanceId")
    private String processInstanceId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    @com.aliyun.core.annotation.NameInMap("version")
    private Long version;

    private GetInstanceByIdResponseBody(Builder builder) {
        this.actionExecutor = builder.actionExecutor;
        this.approvedResult = builder.approvedResult;
        this.createTimeGMT = builder.createTimeGMT;
        this.data = builder.data;
        this.formUuid = builder.formUuid;
        this.instanceStatus = builder.instanceStatus;
        this.modifiedTimeGMT = builder.modifiedTimeGMT;
        this.originator = builder.originator;
        this.processCode = builder.processCode;
        this.processInstanceId = builder.processInstanceId;
        this.requestId = builder.requestId;
        this.title = builder.title;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceByIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return actionExecutor
     */
    public java.util.List<ActionExecutor> getActionExecutor() {
        return this.actionExecutor;
    }

    /**
     * @return approvedResult
     */
    public String getApprovedResult() {
        return this.approvedResult;
    }

    /**
     * @return createTimeGMT
     */
    public String getCreateTimeGMT() {
        return this.createTimeGMT;
    }

    /**
     * @return data
     */
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    /**
     * @return formUuid
     */
    public String getFormUuid() {
        return this.formUuid;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return modifiedTimeGMT
     */
    public String getModifiedTimeGMT() {
        return this.modifiedTimeGMT;
    }

    /**
     * @return originator
     */
    public Originator getOriginator() {
        return this.originator;
    }

    /**
     * @return processCode
     */
    public String getProcessCode() {
        return this.processCode;
    }

    /**
     * @return processInstanceId
     */
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return this.version;
    }

    public static final class Builder {
        private java.util.List<ActionExecutor> actionExecutor; 
        private String approvedResult; 
        private String createTimeGMT; 
        private java.util.Map<String, ?> data; 
        private String formUuid; 
        private String instanceStatus; 
        private String modifiedTimeGMT; 
        private Originator originator; 
        private String processCode; 
        private String processInstanceId; 
        private String requestId; 
        private String title; 
        private String vendorRequestId; 
        private String vendorType; 
        private Long version; 

        /**
         * actionExecutor.
         */
        public Builder actionExecutor(java.util.List<ActionExecutor> actionExecutor) {
            this.actionExecutor = actionExecutor;
            return this;
        }

        /**
         * approvedResult.
         */
        public Builder approvedResult(String approvedResult) {
            this.approvedResult = approvedResult;
            return this;
        }

        /**
         * createTimeGMT.
         */
        public Builder createTimeGMT(String createTimeGMT) {
            this.createTimeGMT = createTimeGMT;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }

        /**
         * formUuid.
         */
        public Builder formUuid(String formUuid) {
            this.formUuid = formUuid;
            return this;
        }

        /**
         * instanceStatus.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * modifiedTimeGMT.
         */
        public Builder modifiedTimeGMT(String modifiedTimeGMT) {
            this.modifiedTimeGMT = modifiedTimeGMT;
            return this;
        }

        /**
         * originator.
         */
        public Builder originator(Originator originator) {
            this.originator = originator;
            return this;
        }

        /**
         * processCode.
         */
        public Builder processCode(String processCode) {
            this.processCode = processCode;
            return this;
        }

        /**
         * processInstanceId.
         */
        public Builder processInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        /**
         * version.
         */
        public Builder version(Long version) {
            this.version = version;
            return this;
        }

        public GetInstanceByIdResponseBody build() {
            return new GetInstanceByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceByIdResponseBody</p>
     */
    public static class Name extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameInChinese")
        private String nameInChinese;

        @com.aliyun.core.annotation.NameInMap("NameInEnglish")
        private String nameInEnglish;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Name(Builder builder) {
            this.nameInChinese = builder.nameInChinese;
            this.nameInEnglish = builder.nameInEnglish;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Name create() {
            return builder().build();
        }

        /**
         * @return nameInChinese
         */
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        /**
         * @return nameInEnglish
         */
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String nameInChinese; 
            private String nameInEnglish; 
            private String type; 

            /**
             * NameInChinese.
             */
            public Builder nameInChinese(String nameInChinese) {
                this.nameInChinese = nameInChinese;
                return this;
            }

            /**
             * NameInEnglish.
             */
            public Builder nameInEnglish(String nameInEnglish) {
                this.nameInEnglish = nameInEnglish;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Name build() {
                return new Name(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceByIdResponseBody</p>
     */
    public static class ActionExecutor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeptName")
        private String deptName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Name")
        private Name name;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ActionExecutor(Builder builder) {
            this.deptName = builder.deptName;
            this.email = builder.email;
            this.name = builder.name;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionExecutor create() {
            return builder().build();
        }

        /**
         * @return deptName
         */
        public String getDeptName() {
            return this.deptName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return name
         */
        public Name getName() {
            return this.name;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String deptName; 
            private String email; 
            private Name name; 
            private String userId; 

            /**
             * DeptName.
             */
            public Builder deptName(String deptName) {
                this.deptName = deptName;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(Name name) {
                this.name = name;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ActionExecutor build() {
                return new ActionExecutor(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceByIdResponseBody</p>
     */
    public static class OriginatorName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameInChinese")
        private String nameInChinese;

        @com.aliyun.core.annotation.NameInMap("NameInEnglish")
        private String nameInEnglish;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private OriginatorName(Builder builder) {
            this.nameInChinese = builder.nameInChinese;
            this.nameInEnglish = builder.nameInEnglish;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginatorName create() {
            return builder().build();
        }

        /**
         * @return nameInChinese
         */
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        /**
         * @return nameInEnglish
         */
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String nameInChinese; 
            private String nameInEnglish; 
            private String type; 

            /**
             * NameInChinese.
             */
            public Builder nameInChinese(String nameInChinese) {
                this.nameInChinese = nameInChinese;
                return this;
            }

            /**
             * NameInEnglish.
             */
            public Builder nameInEnglish(String nameInEnglish) {
                this.nameInEnglish = nameInEnglish;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OriginatorName build() {
                return new OriginatorName(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceByIdResponseBody</p>
     */
    public static class Originator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeptName")
        private String deptName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Name")
        private OriginatorName name;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Originator(Builder builder) {
            this.deptName = builder.deptName;
            this.email = builder.email;
            this.name = builder.name;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Originator create() {
            return builder().build();
        }

        /**
         * @return deptName
         */
        public String getDeptName() {
            return this.deptName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return name
         */
        public OriginatorName getName() {
            return this.name;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String deptName; 
            private String email; 
            private OriginatorName name; 
            private String userId; 

            /**
             * DeptName.
             */
            public Builder deptName(String deptName) {
                this.deptName = deptName;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(OriginatorName name) {
                this.name = name;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Originator build() {
                return new Originator(this);
            } 

        } 

    }
}
