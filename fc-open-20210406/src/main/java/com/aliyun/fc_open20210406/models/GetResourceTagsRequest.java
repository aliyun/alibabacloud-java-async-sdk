// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetResourceTagsRequest} extends {@link RequestModel}
 *
 * <p>GetResourceTagsRequest</p>
 */
public class GetResourceTagsRequest extends Request {
    @Query
    @NameInMap("resourceArn")
    private String resourceArn;


    private GetResourceTagsRequest(Builder builder) {
        super(builder);
        this.resourceArn = builder.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTagsRequest create() {
        return builder().build();
    }

    /**
     * @return resourceArn
     */
    public String getResourceArn() {
        return this.resourceArn;
    }

    public static final class Builder extends Request.Builder {
        private String resourceArn; 

        /**
         * <p>Resource ARN 全称或者简称</p>
         */
        public Builder resourceArn(String resourceArn) {
            this.putQueryParameter("resourceArn", resourceArn);
            this.resourceArn = resourceArn;
            return this;
        }

        public GetResourceTagsRequest build() {
            return new GetResourceTagsRequest(this);
        } 

    } 

}
