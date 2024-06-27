// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePocDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePocDetailRequest</p>
 */
public class DescribePocDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private DescribePocDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.taskId = builder.taskId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePocDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribePocDetailRequest, Builder> {
        private String lang; 
        private String regId; 
        private String taskId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribePocDetailRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.taskId = request.taskId;
            this.type = request.type;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribePocDetailRequest build() {
            return new DescribePocDetailRequest(this);
        } 

    } 

}
