// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link NameCheckResult} extends {@link TeaModel}
 *
 * <p>NameCheckResult</p>
 */
public class NameCheckResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("exist_file_id")
    private String existFileId;

    @com.aliyun.core.annotation.NameInMap("exist_file_type")
    private String existFileType;

    private NameCheckResult(Builder builder) {
        this.existFileId = builder.existFileId;
        this.existFileType = builder.existFileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NameCheckResult create() {
        return builder().build();
    }

    /**
     * @return existFileId
     */
    public String getExistFileId() {
        return this.existFileId;
    }

    /**
     * @return existFileType
     */
    public String getExistFileType() {
        return this.existFileType;
    }

    public static final class Builder {
        private String existFileId; 
        private String existFileType; 

        /**
         * exist_file_id.
         */
        public Builder existFileId(String existFileId) {
            this.existFileId = existFileId;
            return this;
        }

        /**
         * exist_file_type.
         */
        public Builder existFileType(String existFileType) {
            this.existFileType = existFileType;
            return this;
        }

        public NameCheckResult build() {
            return new NameCheckResult(this);
        } 

    } 

}
