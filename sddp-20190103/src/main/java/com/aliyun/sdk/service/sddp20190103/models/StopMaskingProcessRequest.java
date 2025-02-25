// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link StopMaskingProcessRequest} extends {@link RequestModel}
 *
 * <p>StopMaskingProcessRequest</p>
 */
public class StopMaskingProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private StopMaskingProcessRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopMaskingProcessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<StopMaskingProcessRequest, Builder> {
        private Long id; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(StopMaskingProcessRequest request) {
            super(request);
            this.id = request.id;
            this.lang = request.lang;
        } 

        /**
         * <p>The unique ID of the de-identification task. You can query the task ID by calling the <a href="~~DescribeDataMaskingTasks~~">DescribeDataMaskingTasks</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Simplified Chinese (default)</li>
         * <li><strong>en_us</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public StopMaskingProcessRequest build() {
            return new StopMaskingProcessRequest(this);
        } 

    } 

}
