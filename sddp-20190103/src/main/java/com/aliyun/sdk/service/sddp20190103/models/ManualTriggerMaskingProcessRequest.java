// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManualTriggerMaskingProcessRequest} extends {@link RequestModel}
 *
 * <p>ManualTriggerMaskingProcessRequest</p>
 */
public class ManualTriggerMaskingProcessRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    private ManualTriggerMaskingProcessRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManualTriggerMaskingProcessRequest create() {
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

    public static final class Builder extends Request.Builder<ManualTriggerMaskingProcessRequest, Builder> {
        private Long id; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ManualTriggerMaskingProcessRequest request) {
            super(request);
            this.id = request.id;
            this.lang = request.lang;
        } 

        /**
         * The ID of the de-identification task.
         * <p>
         * 
         * The ID of the de-identification task is a string. You can call the DescribeDataMaskingTasks operation to query the ID.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The language of the content within the request and response, default value zh_cn. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public ManualTriggerMaskingProcessRequest build() {
            return new ManualTriggerMaskingProcessRequest(this);
        } 

    } 

}
