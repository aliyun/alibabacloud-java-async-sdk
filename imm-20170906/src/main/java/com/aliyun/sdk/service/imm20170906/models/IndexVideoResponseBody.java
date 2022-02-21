// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IndexVideoResponseBody} extends {@link TeaModel}
 *
 * <p>IndexVideoResponseBody</p>
 */
public class IndexVideoResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("ExternalId")
    private String externalId;

    @NameInMap("ModifyTime")
    private String modifyTime;

    @NameInMap("RemarksA")
    private String remarksA;

    @NameInMap("RemarksB")
    private String remarksB;

    @NameInMap("RemarksC")
    private String remarksC;

    @NameInMap("RemarksD")
    private String remarksD;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetId")
    private String setId;

    @NameInMap("VideoUri")
    private String videoUri;

    private IndexVideoResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.externalId = builder.externalId;
        this.modifyTime = builder.modifyTime;
        this.remarksA = builder.remarksA;
        this.remarksB = builder.remarksB;
        this.remarksC = builder.remarksC;
        this.remarksD = builder.remarksD;
        this.requestId = builder.requestId;
        this.setId = builder.setId;
        this.videoUri = builder.videoUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IndexVideoResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return externalId
     */
    public String getExternalId() {
        return this.externalId;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return remarksA
     */
    public String getRemarksA() {
        return this.remarksA;
    }

    /**
     * @return remarksB
     */
    public String getRemarksB() {
        return this.remarksB;
    }

    /**
     * @return remarksC
     */
    public String getRemarksC() {
        return this.remarksC;
    }

    /**
     * @return remarksD
     */
    public String getRemarksD() {
        return this.remarksD;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    /**
     * @return videoUri
     */
    public String getVideoUri() {
        return this.videoUri;
    }

    public static final class Builder {
        private String createTime; 
        private String externalId; 
        private String modifyTime; 
        private String remarksA; 
        private String remarksB; 
        private String remarksC; 
        private String remarksD; 
        private String requestId; 
        private String setId; 
        private String videoUri; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ExternalId.
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * RemarksA.
         */
        public Builder remarksA(String remarksA) {
            this.remarksA = remarksA;
            return this;
        }

        /**
         * RemarksB.
         */
        public Builder remarksB(String remarksB) {
            this.remarksB = remarksB;
            return this;
        }

        /**
         * RemarksC.
         */
        public Builder remarksC(String remarksC) {
            this.remarksC = remarksC;
            return this;
        }

        /**
         * RemarksD.
         */
        public Builder remarksD(String remarksD) {
            this.remarksD = remarksD;
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
         * SetId.
         */
        public Builder setId(String setId) {
            this.setId = setId;
            return this;
        }

        /**
         * VideoUri.
         */
        public Builder videoUri(String videoUri) {
            this.videoUri = videoUri;
            return this;
        }

        public IndexVideoResponseBody build() {
            return new IndexVideoResponseBody(this);
        } 

    } 

}
