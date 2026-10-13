// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link DescribePerspectiveResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePerspectiveResponseBody</p>
 */
public class DescribePerspectiveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PerspectiveCode")
    private String perspectiveCode;

    @com.aliyun.core.annotation.NameInMap("PerspectiveId")
    private String perspectiveId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SelfDefine")
    private Boolean selfDefine;

    @com.aliyun.core.annotation.NameInMap("Status")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribePerspectiveResponseBody model) {
            this.createTime = model.createTime;
            this.modifyTime = model.modifyTime;
            this.name = model.name;
            this.perspectiveCode = model.perspectiveCode;
            this.perspectiveId = model.perspectiveId;
            this.requestId = model.requestId;
            this.selfDefine = model.selfDefine;
            this.status = model.status;
        } 

        /**
         * <p>The creation time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-27T07:05:37Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The modification time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-26T07:05:37Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The perspective name.</p>
         * 
         * <strong>example:</strong>
         * <p>Mobile perspective</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The perspective code, which is used for the Q&amp;A API.</p>
         * 
         * <strong>example:</strong>
         * <p>FZJBY3raWr</p>
         */
        public Builder perspectiveCode(String perspectiveCode) {
            this.perspectiveCode = perspectiveCode;
            return this;
        }

        /**
         * <p>The perspective ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        public Builder perspectiveId(String perspectiveId) {
            this.perspectiveId = perspectiveId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F285D735-D580-18A8-B97F-B2E72B00F101</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the perspective is custom-defined.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder selfDefine(Boolean selfDefine) {
            this.selfDefine = selfDefine;
            return this;
        }

        /**
         * <p>The data status. Valid values:</p>
         * <ul>
         * <li>3: Enabled.</li>
         * <li>1: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
