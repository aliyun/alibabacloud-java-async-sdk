// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListDirectoriesRequest} extends {@link RequestModel}
 *
 * <p>ListDirectoriesRequest</p>
 */
public class ListDirectoriesRequest extends Request {

    private ListDirectoriesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDirectoriesRequest create() {
        return builder().build();
    }

    public static final class Builder extends Request.Builder {

        public ListDirectoriesRequest build() {
            return new ListDirectoriesRequest(this);
        } 

    } 

}
