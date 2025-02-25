// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayCapacityLimitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayCapacityLimitResponseBody</p>
 */
public class DescribeGatewayCapacityLimitResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("FileNumber")
    private Long fileNumber;

    @NameInMap("FileSystemSizeInTB")
    private Long fileSystemSizeInTB;

    @NameInMap("IsMetadataSeparate")
    private Boolean isMetadataSeparate;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeGatewayCapacityLimitResponseBody(Builder builder) {
        this.code = builder.code;
        this.fileNumber = builder.fileNumber;
        this.fileSystemSizeInTB = builder.fileSystemSizeInTB;
        this.isMetadataSeparate = builder.isMetadataSeparate;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayCapacityLimitResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return fileNumber
     */
    public Long getFileNumber() {
        return this.fileNumber;
    }

    /**
     * @return fileSystemSizeInTB
     */
    public Long getFileSystemSizeInTB() {
        return this.fileSystemSizeInTB;
    }

    /**
     * @return isMetadataSeparate
     */
    public Boolean getIsMetadataSeparate() {
        return this.isMetadataSeparate;
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
        private Long fileNumber; 
        private Long fileSystemSizeInTB; 
        private Boolean isMetadataSeparate; 
        private String message; 
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
         * FileNumber.
         */
        public Builder fileNumber(Long fileNumber) {
            this.fileNumber = fileNumber;
            return this;
        }

        /**
         * FileSystemSizeInTB.
         */
        public Builder fileSystemSizeInTB(Long fileSystemSizeInTB) {
            this.fileSystemSizeInTB = fileSystemSizeInTB;
            return this;
        }

        /**
         * IsMetadataSeparate.
         */
        public Builder isMetadataSeparate(Boolean isMetadataSeparate) {
            this.isMetadataSeparate = isMetadataSeparate;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public DescribeGatewayCapacityLimitResponseBody build() {
            return new DescribeGatewayCapacityLimitResponseBody(this);
        } 

    } 

}
