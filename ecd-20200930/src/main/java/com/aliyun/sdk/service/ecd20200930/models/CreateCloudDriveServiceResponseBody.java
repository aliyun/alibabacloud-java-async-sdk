// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudDriveServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudDriveServiceResponseBody</p>
 */
public class CreateCloudDriveServiceResponseBody extends TeaModel {
    @NameInMap("CdsId")
    private String cdsId;

    @NameInMap("CdsName")
    private String cdsName;

    @NameInMap("MaxSize")
    private String maxSize;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCloudDriveServiceResponseBody(Builder builder) {
        this.cdsId = builder.cdsId;
        this.cdsName = builder.cdsName;
        this.maxSize = builder.maxSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudDriveServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return cdsName
     */
    public String getCdsName() {
        return this.cdsName;
    }

    /**
     * @return maxSize
     */
    public String getMaxSize() {
        return this.maxSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cdsId; 
        private String cdsName; 
        private String maxSize; 
        private String requestId; 

        /**
         * CdsId.
         */
        public Builder cdsId(String cdsId) {
            this.cdsId = cdsId;
            return this;
        }

        /**
         * CdsName.
         */
        public Builder cdsName(String cdsName) {
            this.cdsName = cdsName;
            return this;
        }

        /**
         * MaxSize.
         */
        public Builder maxSize(String maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCloudDriveServiceResponseBody build() {
            return new CreateCloudDriveServiceResponseBody(this);
        } 

    } 

}
