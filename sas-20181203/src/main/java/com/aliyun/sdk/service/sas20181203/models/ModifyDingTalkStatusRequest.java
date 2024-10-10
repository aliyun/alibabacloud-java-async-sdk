// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDingTalkStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyDingTalkStatusRequest</p>
 */
public class ModifyDingTalkStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    private ModifyDingTalkStatusRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDingTalkStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyDingTalkStatusRequest, Builder> {
        private String ids; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDingTalkStatusRequest request) {
            super(request);
            this.ids = request.ids;
            this.status = request.status;
        } 

        /**
         * <p>The notification IDs of DingTalk chatbots. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeDingTalk~~">DescribeDingTalk</a> operation to query the notification IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2259</p>
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The notification status of a DingTalk chatbot. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyDingTalkStatusRequest build() {
            return new ModifyDingTalkStatusRequest(this);
        } 

    } 

}
