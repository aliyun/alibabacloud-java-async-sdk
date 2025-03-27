// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetListResponseBody} extends {@link TeaModel}
 *
 * <p>GetListResponseBody</p>
 */
public class GetListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<String> items;

    @com.aliyun.core.annotation.NameInMap("Kind")
    private String kind;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetListResponseBody(Builder builder) {
        this.description = builder.description;
        this.id = builder.id;
        this.items = builder.items;
        this.kind = builder.kind;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return items
     */
    public java.util.List<String> getItems() {
        return this.items;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String description; 
        private Long id; 
        private java.util.List<String> items; 
        private String kind; 
        private String name; 
        private String requestId; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetListResponseBody model) {
            this.description = model.description;
            this.id = model.id;
            this.items = model.items;
            this.kind = model.kind;
            this.name = model.name;
            this.requestId = model.requestId;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The description of the custom list.</p>
         * 
         * <strong>example:</strong>
         * <p>a custom list</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the custom list.<a href="~~2850217~~"></a></p>
         * 
         * <strong>example:</strong>
         * <p>40000001</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The items in the custom list, which are displayed as an array.</p>
         */
        public Builder items(java.util.List<String> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The type of the custom list.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * <p>The name of the custom list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the custom list was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetListResponseBody build() {
            return new GetListResponseBody(this);
        } 

    } 

}
