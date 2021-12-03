// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UntagResourceRequest} extends {@link RequestModel}
 *
 * <p>UntagResourceRequest</p>
 */
public class UntagResourceRequest extends Request {
    @Body
    @NameInMap("all")
    private Boolean all;

    @Body
    @NameInMap("resourceArn")
    private String resourceArn;

    @Body
    @NameInMap("tagKeys	")
    private java.util.List < String > tagKeys;


    private UntagResourceRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.resourceArn = builder.resourceArn;
        this.tagKeys = builder.tagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourceRequest create() {
        return builder().build();
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return resourceArn
     */
    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * @return tagKeys
     */
    public java.util.List < String > getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder extends Request.Builder {
        private Boolean all; 
        private String resourceArn; 
        private java.util.List < String > tagKeys; 

        /**
         * <p>删除所有 tag，默认值为 false</p>
         */
        public Builder all(Boolean all) {
            this.putBodyParameter("all", all);
            this.all = all;
            return this;
        }

        /**
         * <p>目前只能给 top level 资源 service 进行标签的相关操作, ARN 可以是类似 services/foo 或者 acs:fc:cn-shanghai:123456789:services/foo</p>
         */
        public Builder resourceArn(String resourceArn) {
            this.putBodyParameter("resourceArn", resourceArn);
            this.resourceArn = resourceArn;
            return this;
        }

        /**
         * <p>tag key 值列表， 最大为 20，当 all=false， length 至少为 1. 当 length 大于 1 时， 可以忽略 all 值</p>
         */
        public Builder tagKeys(java.util.List < String > tagKeys) {
            this.putBodyParameter("tagKeys	", tagKeys);
            this.tagKeys = tagKeys;
            return this;
        }

        public UntagResourceRequest build() {
            return new UntagResourceRequest(this);
        } 

    } 

}
