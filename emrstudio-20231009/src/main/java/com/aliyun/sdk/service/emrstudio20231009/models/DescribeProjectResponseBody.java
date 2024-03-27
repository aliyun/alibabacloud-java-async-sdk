// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProjectResponseBody</p>
 */
public class DescribeProjectResponseBody extends TeaModel {
    @NameInMap("code")
    @Validation(required = true)
    private Long code;

    @NameInMap("description")
    @Validation(required = true)
    private String description;

    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @NameInMap("requestId")
    private String requestId;

    private DescribeProjectResponseBody(Builder builder) {
        this.code = builder.code;
        this.description = builder.description;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    public static final class Builder {
        private Long code; 
        private String description; 
        private String name; 
        private String requestId; 

        /**
         * code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProjectResponseBody build() {
            return new DescribeProjectResponseBody(this);
        } 

    } 

}
