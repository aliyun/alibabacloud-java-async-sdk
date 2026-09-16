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
 * {@link RamAccount} extends {@link TeaModel}
 *
 * <p>RamAccount</p>
 */
public class RamAccount extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bindable")
    private Boolean bindable;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    private RamAccount(Builder builder) {
        this.bindable = builder.bindable;
        this.displayName = builder.displayName;
        this.uid = builder.uid;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RamAccount create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindable
     */
    public Boolean getBindable() {
        return this.bindable;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private Boolean bindable; 
        private String displayName; 
        private String uid; 
        private String userName; 

        private Builder() {
        } 

        private Builder(RamAccount model) {
            this.bindable = model.bindable;
            this.displayName = model.displayName;
            this.uid = model.uid;
            this.userName = model.userName;
        } 

        /**
         * <p>Specifies whether the RamAccount can be bound to other resources.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder bindable(Boolean bindable) {
            this.bindable = bindable;
            return this;
        }

        /**
         * <p>The display name for the RamAccount, which appears in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>Test User</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The unique identifier for the RamAccount.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * <p>The user name for the RamAccount.</p>
         * 
         * <strong>example:</strong>
         * <p>test-user</p>
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public RamAccount build() {
            return new RamAccount(this);
        } 

    } 

}
