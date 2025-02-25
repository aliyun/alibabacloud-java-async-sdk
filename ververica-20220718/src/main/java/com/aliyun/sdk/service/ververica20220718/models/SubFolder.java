// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link SubFolder} extends {@link TeaModel}
 *
 * <p>SubFolder</p>
 */
public class SubFolder extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("folderId")
    private String folderId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("parentId")
    private String parentId;

    private SubFolder(Builder builder) {
        this.folderId = builder.folderId;
        this.name = builder.name;
        this.parentId = builder.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubFolder create() {
        return builder().build();
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    public static final class Builder {
        private String folderId; 
        private String name; 
        private String parentId; 

        /**
         * folderId.
         */
        public Builder folderId(String folderId) {
            this.folderId = folderId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * parentId.
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public SubFolder build() {
            return new SubFolder(this);
        } 

    } 

}
