// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePerspectiveResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePerspectiveResponseBody</p>
 */
public class DescribePerspectiveResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("ModifyTime")
    private String modifyTime;

    @NameInMap("Name")
    private String name;

    @NameInMap("PerspectiveCode")
    private String perspectiveCode;

    @NameInMap("PerspectiveId")
    private String perspectiveId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SelfDefine")
    private Boolean selfDefine;

    @NameInMap("Status")
    private Integer status;

    private DescribePerspectiveResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.modifyTime = builder.modifyTime;
        this.name = builder.name;
        this.perspectiveCode = builder.perspectiveCode;
        this.perspectiveId = builder.perspectiveId;
        this.requestId = builder.requestId;
        this.selfDefine = builder.selfDefine;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePerspectiveResponseBody create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return perspectiveCode
     */
    public String getPerspectiveCode() {
        return this.perspectiveCode;
    }

    /**
     * @return perspectiveId
     */
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return selfDefine
     */
    public Boolean getSelfDefine() {
        return this.selfDefine;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String createTime; 
        private String modifyTime; 
        private String name; 
        private String perspectiveCode; 
        private String perspectiveId; 
        private String requestId; 
        private Boolean selfDefine; 
        private Integer status; 

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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * PerspectiveCode.
         */
        public Builder perspectiveCode(String perspectiveCode) {
            this.perspectiveCode = perspectiveCode;
            return this;
        }

        /**
         * PerspectiveId.
         */
        public Builder perspectiveId(String perspectiveId) {
            this.perspectiveId = perspectiveId;
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
         * SelfDefine.
         */
        public Builder selfDefine(Boolean selfDefine) {
            this.selfDefine = selfDefine;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public DescribePerspectiveResponseBody build() {
            return new DescribePerspectiveResponseBody(this);
        } 

    } 

}
