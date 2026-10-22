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
 * {@link DescribeTagResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagResponseBody</p>
 */
public class DescribeTagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateUserId")
    private Long createUserId;

    @com.aliyun.core.annotation.NameInMap("CreateUserName")
    private String createUserName;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("ModifyUserId")
    private Long modifyUserId;

    @com.aliyun.core.annotation.NameInMap("ModifyUserName")
    private String modifyUserName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagName")
    private String tagName;

    private DescribeTagResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.createUserId = builder.createUserId;
        this.createUserName = builder.createUserName;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.modifyTime = builder.modifyTime;
        this.modifyUserId = builder.modifyUserId;
        this.modifyUserName = builder.modifyUserName;
        this.requestId = builder.requestId;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagResponseBody create() {
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
     * @return createUserId
     */
    public Long getCreateUserId() {
        return this.createUserId;
    }

    /**
     * @return createUserName
     */
    public String getCreateUserName() {
        return this.createUserName;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return modifyUserId
     */
    public Long getModifyUserId() {
        return this.modifyUserId;
    }

    /**
     * @return modifyUserName
     */
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder {
        private String createTime; 
        private Long createUserId; 
        private String createUserName; 
        private Long groupId; 
        private Long id; 
        private String modifyTime; 
        private Long modifyUserId; 
        private String modifyUserName; 
        private String requestId; 
        private String tagName; 

        private Builder() {
        } 

        private Builder(DescribeTagResponseBody model) {
            this.createTime = model.createTime;
            this.createUserId = model.createUserId;
            this.createUserName = model.createUserName;
            this.groupId = model.groupId;
            this.id = model.id;
            this.modifyTime = model.modifyTime;
            this.modifyUserId = model.modifyUserId;
            this.modifyUserName = model.modifyUserName;
            this.requestId = model.requestId;
            this.tagName = model.tagName;
        } 

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32323</p>
         */
        public Builder createUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        /**
         * <p>The creator name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder createUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }

        /**
         * <p>The tag group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>232323</p>
         */
        public Builder groupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The tag group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7393472</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The modifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder modifyUserId(Long modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }

        /**
         * <p>The modifier name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder modifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>xxxXxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag 1</p>
         */
        public Builder tagName(String tagName) {
            this.tagName = tagName;
            return this;
        }

        public DescribeTagResponseBody build() {
            return new DescribeTagResponseBody(this);
        } 

    } 

}
