// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link MedicalAnswerMetaData} extends {@link TeaModel}
 *
 * <p>MedicalAnswerMetaData</p>
 */
public class MedicalAnswerMetaData extends TeaModel {
    private MedicalAnswerMetaData(Builder builder) {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MedicalAnswerMetaData create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder {

        private Builder() {
        } 

        private Builder(MedicalAnswerMetaData model) {
        } 

        public MedicalAnswerMetaData build() {
            return new MedicalAnswerMetaData(this);
        } 

    } 

}
