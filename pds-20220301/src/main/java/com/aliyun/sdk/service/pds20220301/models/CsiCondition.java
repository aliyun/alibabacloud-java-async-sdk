// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CsiCondition} extends {@link TeaModel}
 *
 * <p>CsiCondition</p>
 */
public class CsiCondition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("file_data_punish")
    private Condition fileDataPunish;

    private CsiCondition(Builder builder) {
        this.fileDataPunish = builder.fileDataPunish;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CsiCondition create() {
        return builder().build();
    }

    /**
     * @return fileDataPunish
     */
    public Condition getFileDataPunish() {
        return this.fileDataPunish;
    }

    public static final class Builder {
        private Condition fileDataPunish; 

        /**
         * file_data_punish.
         */
        public Builder fileDataPunish(Condition fileDataPunish) {
            this.fileDataPunish = fileDataPunish;
            return this;
        }

        public CsiCondition build() {
            return new CsiCondition(this);
        } 

    } 

}
