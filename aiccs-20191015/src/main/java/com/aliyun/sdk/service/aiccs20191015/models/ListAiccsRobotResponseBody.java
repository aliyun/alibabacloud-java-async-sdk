// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link ListAiccsRobotResponseBody} extends {@link TeaModel}
 *
 * <p>ListAiccsRobotResponseBody</p>
 */
public class ListAiccsRobotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAiccsRobotResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAiccsRobotResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAiccsRobotResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The request status code. OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The robot scripts.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The status code description.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAiccsRobotResponseBody build() {
            return new ListAiccsRobotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAiccsRobotResponseBody} extends {@link TeaModel}
     *
     * <p>ListAiccsRobotResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AtProfession")
        private String atProfession;

        @com.aliyun.core.annotation.NameInMap("AtSence")
        private String atSence;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RobotName")
        private String robotName;

        @com.aliyun.core.annotation.NameInMap("RobotType")
        private String robotType;

        private Data(Builder builder) {
            this.atProfession = builder.atProfession;
            this.atSence = builder.atSence;
            this.id = builder.id;
            this.robotName = builder.robotName;
            this.robotType = builder.robotType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return atProfession
         */
        public String getAtProfession() {
            return this.atProfession;
        }

        /**
         * @return atSence
         */
        public String getAtSence() {
            return this.atSence;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return robotName
         */
        public String getRobotName() {
            return this.robotName;
        }

        /**
         * @return robotType
         */
        public String getRobotType() {
            return this.robotType;
        }

        public static final class Builder {
            private String atProfession; 
            private String atSence; 
            private Long id; 
            private String robotName; 
            private String robotType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.atProfession = model.atProfession;
                this.atSence = model.atSence;
                this.id = model.id;
                this.robotName = model.robotName;
                this.robotType = model.robotType;
            } 

            /**
             * <p>The industry.</p>
             * 
             * <strong>example:</strong>
             * <p>RealEstate</p>
             */
            public Builder atProfession(String atProfession) {
                this.atProfession = atProfession;
                return this;
            }

            /**
             * <p>The associated business.</p>
             * 
             * <strong>example:</strong>
             * <p>NewHomeSales</p>
             */
            public Builder atSence(String atSence) {
                this.atSence = atSence;
                return this;
            }

            /**
             * <p>The robot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12****</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The robot name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestRobot</p>
             */
            public Builder robotName(String robotName) {
                this.robotName = robotName;
                return this;
            }

            /**
             * <p>The robot type.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder robotType(String robotType) {
                this.robotType = robotType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
