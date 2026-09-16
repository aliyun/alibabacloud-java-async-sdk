// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link RamBindingEntry} extends {@link TeaModel}
 *
 * <p>RamBindingEntry</p>
 */
public class RamBindingEntry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("boundUid")
    private String boundUid;

    @com.aliyun.core.annotation.NameInMap("boundUserName")
    private String boundUserName;

    @com.aliyun.core.annotation.NameInMap("milvusUsername")
    private String milvusUsername;

    private RamBindingEntry(Builder builder) {
        this.boundUid = builder.boundUid;
        this.boundUserName = builder.boundUserName;
        this.milvusUsername = builder.milvusUsername;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RamBindingEntry create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return boundUid
     */
    public String getBoundUid() {
        return this.boundUid;
    }

    /**
     * @return boundUserName
     */
    public String getBoundUserName() {
        return this.boundUserName;
    }

    /**
     * @return milvusUsername
     */
    public String getMilvusUsername() {
        return this.milvusUsername;
    }

    public static final class Builder {
        private String boundUid; 
        private String boundUserName; 
        private String milvusUsername; 

        private Builder() {
        } 

        private Builder(RamBindingEntry model) {
            this.boundUid = model.boundUid;
            this.boundUserName = model.boundUserName;
            this.milvusUsername = model.milvusUsername;
        } 

        /**
         * <p>The unique identifier (UID) of the bound RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        public Builder boundUid(String boundUid) {
            this.boundUid = boundUid;
            return this;
        }

        /**
         * <p>The bound RAM username.</p>
         * 
         * <strong>example:</strong>
         * <p>test-user</p>
         */
        public Builder boundUserName(String boundUserName) {
            this.boundUserName = boundUserName;
            return this;
        }

        /**
         * <p>The Milvus username.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder milvusUsername(String milvusUsername) {
            this.milvusUsername = milvusUsername;
            return this;
        }

        public RamBindingEntry build() {
            return new RamBindingEntry(this);
        } 

    } 

}
