// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link CancelSubTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelSubTaskRequest</p>
 */
public class CancelSubTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubTaskId")
    private Integer subTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tab")
    private String tab;

    private CancelSubTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.subTaskId = builder.subTaskId;
        this.tab = builder.tab;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelSubTaskRequest create() {
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
     * @return subTaskId
     */
    public Integer getSubTaskId() {
        return this.subTaskId;
    }

    /**
     * @return tab
     */
    public String getTab() {
        return this.tab;
    }

    public static final class Builder extends Request.Builder<CancelSubTaskRequest, Builder> {
        private String lang; 
        private String regId; 
        private Integer subTaskId; 
        private String tab; 

        private Builder() {
            super();
        } 

        private Builder(CancelSubTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.subTaskId = request.subTaskId;
            this.tab = request.tab;
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
         * RegId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * SubTaskId.
         */
        public Builder subTaskId(Integer subTaskId) {
            this.putQueryParameter("SubTaskId", subTaskId);
            this.subTaskId = subTaskId;
            return this;
        }

        /**
         * Tab.
         */
        public Builder tab(String tab) {
            this.putQueryParameter("Tab", tab);
            this.tab = tab;
            return this;
        }

        @Override
        public CancelSubTaskRequest build() {
            return new CancelSubTaskRequest(this);
        } 

    } 

}
