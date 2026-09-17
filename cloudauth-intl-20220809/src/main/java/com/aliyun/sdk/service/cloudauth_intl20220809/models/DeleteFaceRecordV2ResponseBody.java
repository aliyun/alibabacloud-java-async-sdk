// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link DeleteFaceRecordV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteFaceRecordV2ResponseBody</p>
 */
public class DeleteFaceRecordV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DeleteFaceRecordV2ResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceRecordV2ResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(DeleteFaceRecordV2ResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The return code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5E63B760-0ECB-5C07-8503-A65C27876968</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DeleteFaceRecordV2ResponseBody build() {
            return new DeleteFaceRecordV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteFaceRecordV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteFaceRecordV2ResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Deleted")
        private String deleted;

        @com.aliyun.core.annotation.NameInMap("DeletedGroupCodes")
        private String deletedGroupCodes;

        private Result(Builder builder) {
            this.deleted = builder.deleted;
            this.deletedGroupCodes = builder.deletedGroupCodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return deleted
         */
        public String getDeleted() {
            return this.deleted;
        }

        /**
         * @return deletedGroupCodes
         */
        public String getDeletedGroupCodes() {
            return this.deletedGroupCodes;
        }

        public static final class Builder {
            private String deleted; 
            private String deletedGroupCodes; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.deleted = model.deleted;
                this.deletedGroupCodes = model.deletedGroupCodes;
            } 

            /**
             * <p>The deletion result. Valid values:</p>
             * <ul>
             * <li>Y: Succeeded.</li>
             * <li>N: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder deleted(String deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The list of face group codes from which the face data was actually deleted (comma-separated). This parameter is returned with all deleted group codes when FaceGroupCode is not specified.</p>
             * 
             * <strong>example:</strong>
             * <p>wqe***,dsa***</p>
             */
            public Builder deletedGroupCodes(String deletedGroupCodes) {
                this.deletedGroupCodes = deletedGroupCodes;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
