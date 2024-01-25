// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetComputeResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetComputeResultResponseBody</p>
 */
public class GetComputeResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetComputeResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeResultResponseBody create() {
        return builder().build();
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private Data data; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetComputeResultResponseBody build() {
            return new GetComputeResultResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("bcId")
        private Long bcId;

        @NameInMap("billedNum")
        private Long billedNum;

        @NameInMap("code10000Num")
        private Long code10000Num;

        @NameInMap("code108Num")
        private Long code108Num;

        @NameInMap("code109Num")
        private Long code109Num;

        @NameInMap("exportFileName")
        private String exportFileName;

        @NameInMap("fileLineNumber")
        private Long fileLineNumber;

        @NameInMap("name")
        private String name;

        @NameInMap("password")
        private String password;

        @NameInMap("state")
        private String state;

        private Data(Builder builder) {
            this.bcId = builder.bcId;
            this.billedNum = builder.billedNum;
            this.code10000Num = builder.code10000Num;
            this.code108Num = builder.code108Num;
            this.code109Num = builder.code109Num;
            this.exportFileName = builder.exportFileName;
            this.fileLineNumber = builder.fileLineNumber;
            this.name = builder.name;
            this.password = builder.password;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bcId
         */
        public Long getBcId() {
            return this.bcId;
        }

        /**
         * @return billedNum
         */
        public Long getBilledNum() {
            return this.billedNum;
        }

        /**
         * @return code10000Num
         */
        public Long getCode10000Num() {
            return this.code10000Num;
        }

        /**
         * @return code108Num
         */
        public Long getCode108Num() {
            return this.code108Num;
        }

        /**
         * @return code109Num
         */
        public Long getCode109Num() {
            return this.code109Num;
        }

        /**
         * @return exportFileName
         */
        public String getExportFileName() {
            return this.exportFileName;
        }

        /**
         * @return fileLineNumber
         */
        public Long getFileLineNumber() {
            return this.fileLineNumber;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private Long bcId; 
            private Long billedNum; 
            private Long code10000Num; 
            private Long code108Num; 
            private Long code109Num; 
            private String exportFileName; 
            private Long fileLineNumber; 
            private String name; 
            private String password; 
            private String state; 

            /**
             * bcId.
             */
            public Builder bcId(Long bcId) {
                this.bcId = bcId;
                return this;
            }

            /**
             * billedNum.
             */
            public Builder billedNum(Long billedNum) {
                this.billedNum = billedNum;
                return this;
            }

            /**
             * code10000Num.
             */
            public Builder code10000Num(Long code10000Num) {
                this.code10000Num = code10000Num;
                return this;
            }

            /**
             * code108Num.
             */
            public Builder code108Num(Long code108Num) {
                this.code108Num = code108Num;
                return this;
            }

            /**
             * code109Num.
             */
            public Builder code109Num(Long code109Num) {
                this.code109Num = code109Num;
                return this;
            }

            /**
             * exportFileName.
             */
            public Builder exportFileName(String exportFileName) {
                this.exportFileName = exportFileName;
                return this;
            }

            /**
             * fileLineNumber.
             */
            public Builder fileLineNumber(Long fileLineNumber) {
                this.fileLineNumber = fileLineNumber;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
