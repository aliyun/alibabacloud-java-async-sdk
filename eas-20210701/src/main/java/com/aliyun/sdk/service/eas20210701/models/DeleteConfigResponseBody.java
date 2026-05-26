// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DeleteConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteConfigResponseBody</p>
 */
public class DeleteConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deleted")
    private Integer deleted;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    private DeleteConfigResponseBody(Builder builder) {
        this.deleted = builder.deleted;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleted
     */
    public Integer getDeleted() {
        return this.deleted;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private Integer deleted; 
        private String message; 

        private Builder() {
        } 

        private Builder(DeleteConfigResponseBody model) {
            this.deleted = model.deleted;
            this.message = model.message;
        } 

        /**
         * <p>删除的配置数量</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder deleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * <p>操作结果消息</p>
         * 
         * <strong>example:</strong>
         * <p>Successfully deleted 1 configs</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public DeleteConfigResponseBody build() {
            return new DeleteConfigResponseBody(this);
        } 

    } 

}
