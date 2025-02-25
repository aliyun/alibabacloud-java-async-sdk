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
 * {@link GetInstancesByIdListResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstancesByIdListResponseBody</p>
 */
public class GetInstancesByIdListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetInstancesByIdListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstancesByIdListResponseBody create() {
        return builder().build();
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
    public java.util.List<Result> getResult() {
        return this.result;
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

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
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

        public GetInstancesByIdListResponseBody build() {
            return new GetInstancesByIdListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstancesByIdListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstancesByIdListResponseBody</p>
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
     * {@link GetInstancesByIdListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstancesByIdListResponseBody</p>
     */
    public static class ActionExecutor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DepartmentName")
        private String departmentName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Name")
        private Name name;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ActionExecutor(Builder builder) {
            this.departmentName = builder.departmentName;
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
         * @return departmentName
         */
        public String getDepartmentName() {
            return this.departmentName;
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
            private String departmentName; 
            private String email; 
            private Name name; 
            private String userId; 

            /**
             * DepartmentName.
             */
            public Builder departmentName(String departmentName) {
                this.departmentName = departmentName;
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
     * {@link GetInstancesByIdListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstancesByIdListResponseBody</p>
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
     * {@link GetInstancesByIdListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstancesByIdListResponseBody</p>
     */
    public static class Originator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DepartmentName")
        private String departmentName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Name")
        private OriginatorName name;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Originator(Builder builder) {
            this.departmentName = builder.departmentName;
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
         * @return departmentName
         */
        public String getDepartmentName() {
            return this.departmentName;
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
            private String departmentName; 
            private String email; 
            private OriginatorName name; 
            private String userId; 

            /**
             * DepartmentName.
             */
            public Builder departmentName(String departmentName) {
                this.departmentName = departmentName;
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
    /**
     * 
     * {@link GetInstancesByIdListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstancesByIdListResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionExecutor")
        private java.util.List<ActionExecutor> actionExecutor;

        @com.aliyun.core.annotation.NameInMap("ApprovedResult")
        private String approvedResult;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.Map<String, ?> data;

        @com.aliyun.core.annotation.NameInMap("FormUuid")
        private String formUuid;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("Originator")
        private Originator originator;

        @com.aliyun.core.annotation.NameInMap("ProcessCode")
        private String processCode;

        @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
        private String processInstanceId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Result(Builder builder) {
            this.actionExecutor = builder.actionExecutor;
            this.approvedResult = builder.approvedResult;
            this.data = builder.data;
            this.formUuid = builder.formUuid;
            this.instanceStatus = builder.instanceStatus;
            this.originator = builder.originator;
            this.processCode = builder.processCode;
            this.processInstanceId = builder.processInstanceId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List<ActionExecutor> actionExecutor; 
            private String approvedResult; 
            private java.util.Map<String, ?> data; 
            private String formUuid; 
            private String instanceStatus; 
            private Originator originator; 
            private String processCode; 
            private String processInstanceId; 
            private String title; 

            /**
             * ActionExecutor.
             */
            public Builder actionExecutor(java.util.List<ActionExecutor> actionExecutor) {
                this.actionExecutor = actionExecutor;
                return this;
            }

            /**
             * ApprovedResult.
             */
            public Builder approvedResult(String approvedResult) {
                this.approvedResult = approvedResult;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(java.util.Map<String, ?> data) {
                this.data = data;
                return this;
            }

            /**
             * FormUuid.
             */
            public Builder formUuid(String formUuid) {
                this.formUuid = formUuid;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * Originator.
             */
            public Builder originator(Originator originator) {
                this.originator = originator;
                return this;
            }

            /**
             * ProcessCode.
             */
            public Builder processCode(String processCode) {
                this.processCode = processCode;
                return this;
            }

            /**
             * ProcessInstanceId.
             */
            public Builder processInstanceId(String processInstanceId) {
                this.processInstanceId = processInstanceId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
