// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSetResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSetResponseBody</p>
 */
public class UpdateSetResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("ModifyTime")
    private String modifyTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetId")
    private String setId;

    @NameInMap("SetName")
    private String setName;

    private UpdateSetResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.modifyTime = builder.modifyTime;
        this.requestId = builder.requestId;
        this.setId = builder.setId;
        this.setName = builder.setName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
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
     * @return setName
     */
    public String getSetName() {
        return this.setName;
    }

    public static final class Builder {
        private String createTime; 
        private String modifyTime; 
        private String requestId; 
        private String setId; 
        private String setName; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * SetName.
         */
        public Builder setName(String setName) {
            this.setName = setName;
            return this;
        }

        public UpdateSetResponseBody build() {
            return new UpdateSetResponseBody(this);
        } 

    } 

}
