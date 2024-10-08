// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
    private java.util.List < String > items;

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
    public java.util.List < String > getItems() {
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
        private java.util.List < String > items; 
        private String kind; 
        private String name; 
        private String requestId; 
        private String updateTime; 

        /**
         * <p>自定义响应页面描述</p>
         * 
         * <strong>example:</strong>
         * <p>a custom list</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>自定义响应页面ID</p>
         * 
         * <strong>example:</strong>
         * <p>40000001</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List < String > items) {
            this.items = items;
            return this;
        }

        /**
         * Kind.
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * <p>自定义响应页面名称</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UpdateTime.
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
